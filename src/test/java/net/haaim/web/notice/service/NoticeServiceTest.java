package net.haaim.web.notice.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import net.haaim.web.notice.entity.NoticeEntity;
import net.haaim.web.notice.repository.NoticeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("local")
public class NoticeServiceTest {

//	@Autowired
//	private NoticeRepository repo;
//
//	@Autowired
//	private NoticeService service;
//	
//	@Before
//	public void init() {
//		repo.deleteAll();
//
//		NoticeEntity entity = new NoticeEntity();
//		
//		repo.saveAndFlush(entity);
//	}
	
	@Test
	public void testPage() {
//		PageRequest pageRequest = new PageRequest(1, 10, Sort.Direction.DESC, "no");
//		Page<NoticeEntity> page = service.list(pageRequest);
		System.out.println("hi");
	}
	
	@After
	public void destory() {
//		repo.deleteAll();
	}
}
