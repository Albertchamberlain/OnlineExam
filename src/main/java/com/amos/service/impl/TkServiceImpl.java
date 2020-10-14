package com.amos.service.impl;

import com.amos.dao.*;
import com.amos.pojo.Tk.*;
import com.amos.service.TkService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Amos
 */
public class TkServiceImpl implements TkService {

    @Autowired
    ProgramFillMapper programFillMapper;
    @Autowired
    BlankMapper blankMapper;
    @Autowired
    ReadProgramMapper readProgramMapper;
    @Autowired
    ProgramDesignMapper programDesignMapper;
    @Autowired
    JudgeMapper judgeMapper;
    @Override
    public List<ProgramFill> programFillAll() {
        List<ProgramFill> programFills  = programFillMapper.programFillAll();
        return null;
    }

    @Override
    public ProgramFill byProgramFillId(Long id) {
        return null;
    }

    @Override
    public void deleteProgramFill(ProgramFill programFill) {

    }

    @Override
    public void createProgramFill(ProgramFill programFill) {

    }

    @Override
    public void updateProgramFill(ProgramFill programFill) {

    }

    @Override
    public List<Blank> fillBlankAll() {
        return null;
    }

    @Override
    public Blank findBlankId(Long id) {
        return null;
    }

    @Override
    public void deleteBlank(Long id) {

    }

    @Override
    public void createBlank(Blank blank) {

    }

    @Override
    public void updateBlank(Blank blank) {

    }

    @Override
    public List<ReadProgram> readProgramAll() {
        return null;
    }

    @Override
    public ReadProgram byReadProgram(Long id) {
        return null;
    }

    @Override
    public void deleteReadProgram(ReadProgram readProgram) {

    }

    @Override
    public void createReadProgram(ReadProgram readProgram) {

    }

    @Override
    public List<ProgramDesign> programDesignAll() {
        return null;
    }

    @Override
    public ProgramDesign byProgramDesignId(Long id) {
        return null;
    }

    @Override
    public void deleteProgramDesign(Long id) {

    }

    @Override
    public void crearProgramDesign(ProgramDesign programDesign) {

    }

    @Override
    public void updateProgrameDesign(ProgramDesign programDesign) {

    }

    @Override
    public List<Judge> allJudge() {
        return null;
    }

    @Override
    public Judge findJudgeId(Long id) {
        return null;
    }

    @Override
    public void deleteJudge(Long id) {

    }

    @Override
    public void createJudge(Judge judge) {

    }

    @Override
    public void updateJudge(Judge judge) {

    }

    @Override
    public void deleteManyJudge(String chkValue) {

    }
}
