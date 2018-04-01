package com.ishoptest.pageobjects.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Loads property files from resource folder to populate locator property object.
 * 
 * @author Jerry
 *
 */
public class LocatorPropertyHelper {

	private static String propertyFolderPath = 
			System.getProperty("user.dir") + File.separator 
			+ "locator-resource" + File.separator;
	
	public Properties locatorProperties = null;
	
	/*
	 * Creates properties map from predefined path.
	 */
	public LocatorPropertyHelper() {
		this.locatorProperties = new Properties();
		
		try {
			this.locatorProperties.load(
					new FileInputStream(propertyFolderPath + "NavigationBar.properties"));
			
			this.locatorProperties.load(
					new FileInputStream(propertyFolderPath + "SignInPage.properties"));
			
			// To load more files ...
			
		} catch (FileNotFoundException e) {
			// TODO Add log error here ...
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Add log error here ...
			e.printStackTrace();
		}
	}
	
	/**
	 * Gets a locator value by its name.
	 * @param locatorName
	 * @return locator value
	 */
	public String getLocatorValue(String locatorName) {
		return this.locatorProperties.getProperty(locatorName);
	}
}
