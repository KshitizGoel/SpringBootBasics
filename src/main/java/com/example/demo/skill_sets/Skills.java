package com.example.demo.skill_sets;

public class Skills {

    public String language;
    public String expertiseLevel;
    public double experience;


    public Skills() {
    }

    public Skills(String language, String expertiseLevel, double experience) {
        this.language = language;
        this.expertiseLevel = expertiseLevel;
        this.experience = experience;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getExpertiseLevel() {
        return expertiseLevel;
    }

    public void setExpertiseLevel(String expertiseLevel) {
        this.expertiseLevel = expertiseLevel;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "language='" + language + '\'' +
                ", expertise=" + expertiseLevel +
                ", age=" + experience + "Years" +
                '}';
    }

}
