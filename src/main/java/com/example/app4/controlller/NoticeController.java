package com.example.app4.controlller;

import com.example.app4.dto.BoardDTO;
import com.example.app4.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class NoticeController {
   // private final NoticeService noticeService;
    @GetMapping("/notice/list")
    public String findAll(Model model){
       // List<NoticeDTO> noticeDTOList = noticeService.findAll();
       // model.addAttribute("noticeList",noticeDTOList);
        return "/notice/list";
    }
}
