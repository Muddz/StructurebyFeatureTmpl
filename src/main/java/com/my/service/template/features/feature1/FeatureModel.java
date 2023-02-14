package com.my.service.template.features.feature1;

// 'public' access modifier since a 'record' may be used across different Features.
public record FeatureModel(String firstname, String lastname, String username, int age) {}