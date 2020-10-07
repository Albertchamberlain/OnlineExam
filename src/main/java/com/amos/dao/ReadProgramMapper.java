package com.amos.dao;

import com.amos.pojo.Tk.ReadProgram;

import java.util.List;

/**
 * @author Amos
 */
public interface ReadProgramMapper {
    List<ReadProgram> readProgramAll();
    ReadProgram byReadProgramId(Long id);
    void deleteReadProgram(Long id);
    void creatReadProgram(ReadProgram readProgram);
    void updateReadProgram(ReadProgram readProgram);
}
