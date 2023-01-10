package com.lucasple.treeftp.app;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.lucasple.treeftp.communication.FTPClient;

/**
 * Main class that launches the TreeFTP command
 * @author lucas
 *
 */

public class TreeFTP {
	
	private static final Log LOGGER = LogFactory.getLog(TreeFTP.class);
	
	private static final int NB_PARAMS_MIN_EXPECTED = 1;
	private static final int NB_PARAMS_MAX_EXPECTED = 3;
	private static final int FTP_PORT = 21;
	
    public static void main(String[] args) {
    	String address = "";
    	String login = "";
    	String password = "";
    	
    	if(args.length == NB_PARAMS_MIN_EXPECTED) {
    		address = args[0];
    		FTPClient.handle(address, FTP_PORT);
    	}
    	else if(args.length == NB_PARAMS_MAX_EXPECTED) {
    		address = args[0];
    		login = args[1];
    		password = args[2];
    		FTPClient.handle(address, FTP_PORT, login, password);
    	}
    	else {
    		LOGGER.info("Provide at least the arguments required : <address> and if you want the two following : <login> <password>");
    		System.exit(1);
    	}
    }
}
