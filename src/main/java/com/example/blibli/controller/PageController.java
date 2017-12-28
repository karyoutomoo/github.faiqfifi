package com.example.blibli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("/login")
	public String index() {
		return "login";
	}
	
	@RequestMapping("/beranda")
	public String index2() {
		return "beranda";
	}
	
	@RequestMapping("/v_admin_tambah_admin")
	public String index3() {
		return "v_admin_tambah_admin";
	}
	
	@RequestMapping("/v_admin_lihat_rekap")
	public String index4() {
		return "v_admin_lihat_rekap";
	}
	
	@RequestMapping("/v_admin_lihat_ruangan")
	public String index5() {
		return "v_admin_lihat_ruangan";
	}
	
	@RequestMapping("/v_admin_dashboard")
	public String index6() {
		return "v_admin_dashboard";
	}
	
	@RequestMapping("/v_admin_lihat_kategori")
	public String index7() {
		return "v_admin_lihat_kategori";
	}
	
	@RequestMapping("/v_admin_tambah_pelanggan")
	public String index8() {
		return "v_admin_tambah_pelanggan";
	}
}
