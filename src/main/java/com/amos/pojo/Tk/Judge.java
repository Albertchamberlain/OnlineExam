package com.amos.pojo.Tk;

/**
 * @author Amos
 */
public class Judge {
    private Long id;
    private String content;
    private  String answer;
    private  String analysis;
    private String chaper;
    private  String chaptertwo;
    private String  difficulty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getChaper() {
        return chaper;
    }

    public void setChaper(String chaper) {
        this.chaper = chaper;
    }

    public String getChaptertwo() {
        return chaptertwo;
    }

    public void setChaptertwo(String chaptertwo) {
        this.chaptertwo = chaptertwo;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
