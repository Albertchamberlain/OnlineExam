package com.amos.dao;

import com.amos.pojo.Tk.ProgramDesign;

import java.util.List;

/**
 * @author Amos
 */
public interface ProgramDesignMapper {
    /**
     * programDesignAll
     * @return
     */
    List<ProgramDesign> programDesignAll();
    ProgramDesign byProgramDesignId(Long id);
    void deleteProgramDesign(Long id);
    void creatProgramDesign(ProgramDesign programDesign);
    void updateProgramDesign(ProgramDesign programDesign);
}
