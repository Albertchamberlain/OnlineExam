package com.amos.dao;

import com.amos.pojo.Exam.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Amos
 */
public interface ExamMapper {
    void createExam(ExamInformation examInformation);
    List<ExamInformation> AllExam();
    List<PaperChoice> RandChoice(@Param("choicenum") Long choicenum,@Param("chaptertwo") String chaptertwo ,@Param("difficulty") int difficulty);
    List<PaperJudge> RandJudge(@Param("judgenum") Long judgenum,@Param("chaptertwo") String chaptertwo ,@Param("difficulty") int difficulty);
    void insertRandChoice(List<PaperChoice> paperChoices);
    void insertRandJudge(List<PaperJudge> paperJudges);
    List<PaperChoice> allPaperChoice(int examid);
    List<PaperJudge> allPaperJudge(int examid);
    ExamInformation findById(int id);
    void  creatAllAnswer(List<AllAnswer> allAnswers);
    void creatExamHistory(ExamHistory examHistories);
    List<ExamHistory> byStudentId(int studentid);
    ExamHistory detailsExam(@Param("studentid") int studentid,@Param("examid") int examid);
    List<ExamInformation> alreadExam(List<Long> longList);
    List<AllAnswer> allAnswer(@Param("studentid") int studentid,@Param("examid") int examid);
    void deletePaperChoice(int examid);
    void deletePaperJudge(int examid);
    void deleteExamInfo(int examid);
    List<ExamHistory> byExamId(int examid);

}
