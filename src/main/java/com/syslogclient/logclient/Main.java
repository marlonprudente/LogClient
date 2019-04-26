package com.syslogclient.logclient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static final Logger LOG = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		
		LOG.debug("Printed On Debug");
		LOG.info("Printed On Info");
		LOG.warn("Printed On Warn");
		LOG.error("Printed On Error");
		LOG.fatal("Printed On Fatal");

		LOG.info("Appending string: {}.", "Hi!");
	}
}