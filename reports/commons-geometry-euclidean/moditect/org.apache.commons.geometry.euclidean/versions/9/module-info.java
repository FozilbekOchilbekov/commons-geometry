module org.apache.commons.geometry.euclidean {
    requires org.apache.commons.numbers.angle;

    requires transitive org.apache.commons.geometry.core;
    requires transitive org.apache.commons.numbers.core;
    requires transitive org.apache.commons.numbers.quaternion;

    exports org.apache.commons.geometry.euclidean;
    exports org.apache.commons.geometry.euclidean.internal;
    exports org.apache.commons.geometry.euclidean.oned;
    exports org.apache.commons.geometry.euclidean.threed;
    exports org.apache.commons.geometry.euclidean.threed.line;
    exports org.apache.commons.geometry.euclidean.threed.mesh;
    exports org.apache.commons.geometry.euclidean.threed.rotation;
    exports org.apache.commons.geometry.euclidean.threed.shape;
    exports org.apache.commons.geometry.euclidean.twod;
    exports org.apache.commons.geometry.euclidean.twod.hull;
    exports org.apache.commons.geometry.euclidean.twod.path;
    exports org.apache.commons.geometry.euclidean.twod.rotation;
    exports org.apache.commons.geometry.euclidean.twod.shape;

}
