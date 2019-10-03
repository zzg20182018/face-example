package com.example.face.web.filter;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.*;
import java.nio.charset.Charset;

public class RequestBodyHttpServletRequestWrapper extends HttpServletRequestWrapper {
    private static final Logger log = LogManager.getLogger(RequestBodyHttpServletRequestWrapper.class);
    boolean isUpData = false;// 判断是否是上传 上传忽略

    public RequestBodyHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
        String contentType = request.getContentType();
        if (null != contentType) {
            isUpData = contentType.startsWith("multipart");
        }

    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
        try {
            if (isUpData) {
                return super.getInputStream();
            } else {
                ServletInputStream servletInputStream = super.getInputStream();
                final ByteArrayInputStream bais = new ByteArrayInputStream(inputHandlers(servletInputStream).getBytes("utf-8"));

                return new ServletInputStream() {

                    @Override
                    public boolean isFinished() {
                        return false;
                    }

                    @Override
                    public boolean isReady() {
                        return false;
                    }

                    @Override
                    public void setReadListener(ReadListener readListener) {

                    }

                    @Override
                    public int read() throws IOException {
                        return bais.read();
                    }

                };

            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String inputHandlers(ServletInputStream servletInputStream) {
        BufferedReader reader = null;
        String requestBody = null;
        try {
            reader = new BufferedReader(new InputStreamReader(servletInputStream, Charset.forName("UTF-8")));
            requestBody = IOUtils.toString(servletInputStream, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (servletInputStream != null) {
                try {
                    servletInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        if (requestBody != null) {
            log.info("JSON:{}", requestBody);
            setAttribute("JSON", requestBody);
        }

        return requestBody;
    }

}