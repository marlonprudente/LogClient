package com.syslogclient.logclient;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static final Logger LOG = LogManager.getLogger(Main.class);
        
	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		LOG.debug("Printed On Debug");
		LOG.info("Printed On Info");
		LOG.warn("Printed On Warn");
		LOG.error("Printed On Error");
		LOG.fatal("Printed On Fatal");
		LOG.info("Appending string: {}.", "Hi!");
                
                try{
                    System.out.println(a.get(0));
                }catch(Exception e){
                    LOG.error(e);
                }
	}
}