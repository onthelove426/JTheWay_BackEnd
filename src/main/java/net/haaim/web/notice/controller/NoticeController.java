package net.haaim.web.notice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.haaim.web.common.request.CustomPageRequest;
import net.haaim.web.common.response.ApiResponse;
import net.haaim.web.notice.service.NoticeService;

@RestController
@RequestMapping("/notice")
public class NoticeController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private NoticeService service;

	@RequestMapping(value = "searchAll", method = RequestMethod.GET)
	public ApiResponse search(@RequestParam Integer page, Integer size) {

		try {

			PageRequest pageRequest = CustomPageRequest.of(1, 10, "no");

			Page result = service.list(pageRequest);

			return ApiResponse.getSuccessResponse(result);

		} catch (Exception e) {
			logger.error("search error", e);

			return ApiResponse.getErrorResponse(e);

		}
	}

	@RequestMapping(value = "search", method = RequestMethod.GET)
	public ApiResponse search(@RequestParam Integer page, @RequestParam Integer size, @RequestParam String key) {

		try {

			PageRequest pageRequest = CustomPageRequest.of(1, 10, "no");

			Page result = service.list(pageRequest);

			return ApiResponse.getSuccessResponse(result);

		} catch (Exception e) {
			logger.error("search error", e);

			return ApiResponse.getErrorResponse(e);

		}
	}
}
