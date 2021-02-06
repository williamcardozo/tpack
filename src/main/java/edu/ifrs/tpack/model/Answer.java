package edu.ifrs.tpack.model;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
/**
 * Comentário da classe Answer
 */
public class Answer {

    @Id
    @GeneratedValue
    /**
     * Comentando atributo
     */
    private long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    /**
     * Comentando atributo
     */
    private Subject subject;

    @ManyToOne(cascade = CascadeType.PERSIST)
    /**
     * Comentando atributo
     */
    private Question question;

    @ManyToOne(cascade = CascadeType.PERSIST)
    /**
     * Comentando atributo
     */
    private Choice choice;

    /**
     * Comentando atributo
     */
    private String answer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @JsonbTransient
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Choice getChoice() {
        return choice;
    }

    public void setChoice(Choice choice) {
        this.choice = choice;
    }

}