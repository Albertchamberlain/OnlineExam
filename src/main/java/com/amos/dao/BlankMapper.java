package com.amos.dao;

import com.amos.pojo.Tk.Blank;

import java.util.List;

/**
 * @author Amos
 */
public interface BlankMapper {
    List<Blank> findBlankAll();
    Blank findbyBlankId(Long id);
    void deleteBlank(Long id);
    void createBlank(Blank blank);
    void updateBlank(Blank blank);
}
