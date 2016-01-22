package com.android.volley.toolbox;

import org.apache.http.client.methods.HttpPost;

import java.net.URI;

/**
 * Created by taqtile on 1/22/16.
 */
public class HttpDelete extends HttpPost {
    public static final String METHOD_NAME = "DELETE";

    public HttpDelete() {
        super();
    }

    public HttpDelete(URI uri) {
        super(uri);
    }

    public HttpDelete(String uri) {
        super(uri);
    }

    public String getMethod() {
        return METHOD_NAME;
    }
}
