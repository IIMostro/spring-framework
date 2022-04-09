package org.ilmostro.core.service.transaction;

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
