package net.haaim.web.menu.service;

import java.util.List;

import net.haaim.web.common.Role;
import net.haaim.web.menu.entity.MenuResponse;

public interface MenuService {
	public List<MenuResponse> search(Role useType, int usage);
}
