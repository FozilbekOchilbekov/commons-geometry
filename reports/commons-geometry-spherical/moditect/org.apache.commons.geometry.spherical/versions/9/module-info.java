module org.apache.commons.geometry.spherical {
    requires transitive org.apache.commons.geometry.core;
    requires transitive org.apache.commons.geometry.euclidean;
    requires transitive org.apache.commons.numbers.angle;
    requires transitive org.apache.commons.numbers.core;

    exports org.apache.commons.geometry.spherical;
    exports org.apache.commons.geometry.spherical.oned;
    exports org.apache.commons.geometry.spherical.twod;

}
