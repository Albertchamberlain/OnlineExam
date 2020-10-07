package com.amos.dao;

import com.amos.pojo.Tk.ProgramFill;

import java.util.List;

/**
 * @author Amos
 */
public interface ProgramFillMapper {
    List<ProgramFill> programFillAll();
    ProgramFill byProgramFillId(Long id);
    void deleteProgramFill(ProgramFill programFill);
    void creatProgramFill(ProgramFill programFill);
    void updateProgramFill(ProgramFill programFill);
}
