package br.com.erudio.integrationtests.vo.wrappers;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WrapperBookVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("_embedded")
    private br.com.erudio.integrationtests.vo.wrappers.BookEmbeddedVO embedded;

    public WrapperBookVO() {}

    public BookEmbeddedVO getEmbedded() {
        return embedded;
    }

    public void setEmbedded(BookEmbeddedVO embedded) {
        this.embedded = embedded;
    }
}