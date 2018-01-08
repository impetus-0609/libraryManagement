package dto;

import java.io.Serializable;

public class LoginDto implements Serializable {

    // メールアドレス
    private String mailAddress;

    // パスワード
    private String password;

    /**
     * mailAddressを取得します。
     * @return mailAddress
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * mailAddressを設定します。
     * @param mailAddress mailAddress
     */
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    /**
     * passwordを取得します。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * passwordを設定します。
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }


}
