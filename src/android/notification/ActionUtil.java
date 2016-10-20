package de.appplant.cordova.plugin.notification;

/**
 * Created by User on 20.10.2016.
 */
public class ActionUtil {
    private Integer id;
    private String text;
    private Boolean launchApp = false;

    public ActionUtil (Integer id, String text, Boolean launchApp) {
        this.id = id;
        this.text = text;
        this.launchApp = launchApp;
    }

    public Integer getId () {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public String getText () {
        return text;
    }

    public void setText (String text) {
        this.text = text;
    }

    public Boolean getLaunchApp () {
        return launchApp;
    }

    public void setLaunchApp (Boolean launchApp) {
        this.launchApp = launchApp;
    }
}
