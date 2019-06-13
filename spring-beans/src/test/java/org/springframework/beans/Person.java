package org.springframework.beans;

import org.springframework.stereotype.Component;

/**
 *  * @author biqin.wu
 *  * @since 12 June 2019
 *  
 */
@Component
public class Person {

	public void say() {
		System.out.println("[][][][][]->say");
	}
}
