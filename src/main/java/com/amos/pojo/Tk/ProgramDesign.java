package com.amos.pojo.Tk;

/**
 * @author Amos
 */
public class ProgramDesign {
    private Long id;
    private String content;
    private  String answer;
    private  String analysis;
    private String chapter;
    private  String chaptertwo;

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

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getChaptertwo() {
        return chaptertwo;
    }

    public void setChaptertwo(String chaptertwo) {
        this.chaptertwo = chaptertwo;
    }

    public String getDiffculty() {
        return diffculty;
    }

    public void setDiffculty(String diffculty) {
        this.diffculty = diffculty;
    }

    private String diffculty;
}
