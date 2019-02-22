/*
 * Copyright (c) 2019
 * United States Army Corps of Engineers - Hydrologic Engineering Center (USACE/HEC)
 * All Rights Reserved.  USACE PROPRIETARY/CONFIDENTIAL.
 * Source may not be released without written approval from HEC
 */

package com.rma.test.sonar.uglyclasses;

/**
 * Company: Resource Management Associates
 *
 * @author <a href="mailto:adam@rmanet.com">Adam Korynta</a>
 * @since 02-22-2019
 */
public class ShouldFailSonarAnalysis
{
	public static void main(String[] args)
	{
		if(args == null)
		{
			String throwNullPointer = args[0];
		}
	}
}
