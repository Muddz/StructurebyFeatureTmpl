package com.my.service.template.features.feature1;

import org.springframework.stereotype.Repository;

@Repository
// No access modifier to Repository classes to make them package-private for the feature. 
// Access to Repository should happend through Service classes.
class FeatureRepository {
}
