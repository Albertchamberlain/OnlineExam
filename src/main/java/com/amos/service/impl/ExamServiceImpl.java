package com.amos.service.impl;

import com.amos.dao.ExamMapper;
import com.amos.pojo.Exam.*;
import com.amos.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamMapper examMapper;

    @Override
    public void createExam(ExamInformation examInformation) {
        examMapper.createExam(examInformation);
    }

    @Override
    public List<ExamInformation> allExam() {
        return examMapper.AllExam();
    }

    @Override
    public List<PaperChoice> randChoice(Long choicenum, String chaptertwo, int difficulty) {
        return examMapper.RandChoice(choicenum,chaptertwo,difficulty);
    }

    @Override
    public List<PaperJudge> randJudge(Long judgnum, String chaptertwo, int difficulty) {
        return examMapper.RandJudge(judgnum, chaptertwo, difficulty);
    }

    @Override
    public void insertRandChoice(List<PaperChoice> paperChoices) {
            examMapper.insertRandChoice(paperChoices);
    }

    @Override
    public void insertRandJudge(List<PaperJudge> paperJudges) {
            examMapper.insertRandJudge(paperJudges);
    }

    @Override
    public List<AllAnswer> allAnswer(int studentid, int examid) {
        return examMapper.allAnswer(studentid, examid);
    }

    @Override
    public List<ExamHistory> byStudentid(int studentid) {
        return examMapper.byStudentId(studentid);
    }

    @Override
    public List<ExamInformation> alreadExam(List<Long> longList) {
        return examMapper.alreadExam(longList);
    }

    @Override
    public ExamHistory detilsExam(int studentid, int examid) {
        return examMapper.detailsExam(studentid, examid);
    }

    @Override
    public void deletePaperChoice(int examid) {
        examMapper.deletePaperChoice(examid);
    }

    @Override
    public void deletePaperJudge(int examid) {
        examMapper.deletePaperJudge(examid);
    }

    @Override
    public void deleteExamInfo(int examid) {
        examMapper.deleteExamInfo(examid);
    }

    @Override
    public List<ExamHistory> byExamId(int examid) {
        return examMapper.byExamId(examid);
    }
}
