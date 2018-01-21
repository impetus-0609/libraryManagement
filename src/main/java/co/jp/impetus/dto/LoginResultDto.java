package co.jp.impetus.dto;

import java.io.Serializable;

public class LoginResultDto implements Serializable {

    // ID
    private int id;

    /**
     * idを取得します。
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * idを設定します。
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

}