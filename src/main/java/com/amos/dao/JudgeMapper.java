package com.amos.dao;

import com.amos.pojo.Tk.Judge;

/**
 * @author Amos
 */
public interface JudgeMapper {
    Judge findJudgeId(Long id);
    void deleteJudge(Long id);
    void createJudge(Judge judge);
    void updateJudge(Judge judge);
    void deleteManyJudge(String chkValue);
}
