package org.ilmostro.service.transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author li.bowei
 */
@Service
public class DemoTransactionService {

	@Transactional(rollbackFor = Exception.class)
	public void transaction(){
		System.out.println("before ...");

		System.out.println("after ...");
	}

//	public void error(){
//		throw new RuntimeException("error!");
//	}
}
