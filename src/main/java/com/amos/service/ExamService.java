package com.amos.service;

import com.amos.pojo.Exam.*;

import java.util.List;

public interface ExamService {

    void  createExam(ExamInformation examInformation);

    List<ExamInformation> allExam();

    List<PaperChoice> randChoice(Long choicenum,String chaptertwo,int difficulty);

    List<PaperJudge> randJudge(Long judgnum,String chaptertwo,int difficulty);

    void insertRandChoice(List<PaperChoice> paperChoices);

    void insertRandJudge(List<PaperJudge> paperJudges);

    List<AllAnswer> allAnswer(int studentid ,int examid);

    List<ExamHistory> byStudentid(int studentid);

    List<ExamInformation> alreadExam(List<Long> longList);

    ExamHistory detilsExam(int studentid,int examid);

    void deletePaperChoice(int examid);

    void deletePaperJudge(int examid);

    void deleteExamInfo(int examid);

    List<ExamHistory> byExamId(int examid);
}
