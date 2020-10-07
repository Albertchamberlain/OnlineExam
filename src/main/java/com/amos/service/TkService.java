package com.amos.service;

import com.amos.pojo.Tk.*;

import java.util.List;

public interface TkService {
    List<ProgramFill> programFillAll();

    ProgramFill byProgramFillId(Long id);

    void deleteProgramFill(ProgramFill programFill);

    void createProgramFill(ProgramFill programFill);

    void updateProgramFill(ProgramFill programFill);

    List<Blank> fillBlankAll();

    Blank findBlankId(Long id);

    void deleteBlank(Long id);

    void createBlank(Blank blank);

    void  updateBlank(Blank blank);

    List<ReadProgram> readProgramAll();

    ReadProgram byReadProgram(Long id);

    void deleteReadProgram(ReadProgram readProgram);

    void createReadProgram(ReadProgram readProgram);

    List<ProgramDesign> programDesignAll();

    ProgramDesign byProgramDesignId(Long id);

    void deleteProgramDesign(Long id);

    void crearProgramDesign(ProgramDesign programDesign);

    void updateProgrameDesign(ProgramDesign programDesign);

    List<Judge> allJudge();

    Judge findJudgeId(Long id);

    void deleteJudge(Long id);

    void createJudge(Judge judge);

    void updateJudge(Judge judge);

    void deleteManyJudge(String chkValue);


}
