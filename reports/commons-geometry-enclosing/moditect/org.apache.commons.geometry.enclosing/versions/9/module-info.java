module org.apache.commons.geometry.enclosing {
    requires org.apache.commons.numbers.fraction;

    requires transitive org.apache.commons.geometry.core;
    requires transitive org.apache.commons.geometry.euclidean;
    requires transitive org.apache.commons.numbers.core;

    exports org.apache.commons.geometry.enclosing;
    exports org.apache.commons.geometry.enclosing.euclidean.threed;
    exports org.apache.commons.geometry.enclosing.euclidean.twod;

}
