package com.example.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray argv, CallbackContext callbackContext) throws JSONException {

	if (action.equals("echo")) {
			String message = argv.getString(0);
			this.echo(message, callbackContext);
			return true;
		} else {
            
            return false;

        }
    }
	private void echo(String message, CallbackContext callbackContext) {
		if (message != null && message.length() > 0) {
			callbackContext.success(message);
		} else {
			callbackContext.error("Expected one non-empty string argument.");
		}
	}
}
