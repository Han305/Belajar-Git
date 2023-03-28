package com.rayhan.training.git.controller;

import com.rayhan.training.git.dao.TamuDao;
import com.rayhan.training.git.entity.Tamu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TamuController {

    @Autowired private TamuDao tamuDao;

    @GetMapping("/api/tamu")
    @ResponseBody
    public Page<Tamu> daftarTamuApi(Pageable page) {
        return tamuDao.findAll(page);
    }

    @GetMapping("/tamu/list")
    public ModelMap daftarTamuHtml(Pageable page) {
        return new ModelMap()
                .addAttribute("daftarTamu",
                        tamuDao.findAll(page));
    }
}
