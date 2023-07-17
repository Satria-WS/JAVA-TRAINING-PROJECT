package com.example.demo;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route//should be mapped to the empty route
public class MainView extends VerticalLayout {
    private PersonRepository repository;
    //VerticalLayout meaning that any components we put in here will get stacked vertically on top of each other

    //build constructor here
    public MainView(PersonRepository repository) {
        this.repository = repository;

    }
}
