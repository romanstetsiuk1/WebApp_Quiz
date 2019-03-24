package com.romanstetsiuk.servlet;

import com.romanstetsiuk.model.Question;
import com.romanstetsiuk.model.Quiz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/quizType")
public class QuizType extends HttpServlet {

    List<Quiz> quizzes = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        Question question1 = new Question("qwer", "as1", "sd2", "sdf3", "sdf4");
        Question question2 = new Question("qwbmnbmer", "as1", "sd2", "sdf3", "sdf4");
        Question question3 = new Question("qwmbmer", "as1", "sd2", "sdf3", "sdf4");
        Question question4 = new Question("qwervbn", "as1", "sd2", "sdf3", "sdf4");
        Question question5 = new Question("qwesdfr", "as1", "sd2", "sdf3", "sdf4");
        Question question6 = new Question("qwsxxxxfer", "as1", "sd2", "sdf3", "sdf4");

        List<Question> quizType1 = new ArrayList<>();
        quizType1.add(question1);
        quizType1.add(question2);
        quizType1.add(question3);

        List<Question> quizType2 = new ArrayList<>();
        quizType2.add(question4);
        quizType2.add(question5);
        quizType2.add(question6);

        Quiz quiz1 = new Quiz("Sport", quizType1);
        Quiz quiz2 = new Quiz("Media", quizType2);

        quiz1.setId(0L);
        quiz2.setId(1L);

        quizzes.add(quiz1);
        quizzes.add(quiz2);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        req.setAttribute("list", quizzes);
        req.getRequestDispatcher("/quizTypeView.jsp").forward(req, resp);
    }
}
