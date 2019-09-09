package br.com.template;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.wpf.Button;
import com.hp.lft.sdk.wpf.ButtonDescription;
import com.hp.lft.sdk.wpf.EditField;
import com.hp.lft.sdk.wpf.EditFieldDescription;
import com.hp.lft.sdk.wpf.Window;
import com.hp.lft.sdk.wpf.WindowDescription;

import unittesting.UnitTestClassBase;

public class LeanFtTest extends UnitTestClassBase {

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws IOException, GeneralLeanFtException {

    	new ProcessBuilder("C:\\Program Files (x86)\\Micro Focus\\UFT\\samples\\Flights Application\\FlightsGUI.exe").start();
		
		Window microFocusMyFlightSampleApplicationWindow = Desktop.describe(Window.class, new WindowDescription.Builder()
				.fullType("window")
				.objectName("Micro Focus MyFlight Sample Application")
				.windowTitleRegExp("Micro Focus MyFlight Sample Application").build());
		EditField agentNameEditField = microFocusMyFlightSampleApplicationWindow.describe(EditField.class, new EditFieldDescription.Builder()
				.objectName("agentName").build());
		agentNameEditField.setText("john");

		EditField passwordEditField = microFocusMyFlightSampleApplicationWindow.describe(EditField.class, new EditFieldDescription.Builder()
				.objectName("password").build());
		passwordEditField.setSecure("5d70148c6f236a462409");

		Button wpfButtonButton = microFocusMyFlightSampleApplicationWindow.describe(Button.class, new ButtonDescription.Builder()
				.objectName("okButton")
				.text("OK").build());
		wpfButtonButton.click();



    }

}