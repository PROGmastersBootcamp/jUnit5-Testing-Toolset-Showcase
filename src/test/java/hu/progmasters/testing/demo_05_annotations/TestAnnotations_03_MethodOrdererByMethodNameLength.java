package hu.progmasters.testing.demo_05_annotations;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrdererContext;

import java.util.Comparator;

class MethodOrdererByMethodNameLength implements MethodOrderer {

    @Override
    public void orderMethods(MethodOrdererContext context) {
        context.getMethodDescriptors().sort(
                Comparator.comparingInt(methodDescriptor -> methodDescriptor.getMethod()
                                                                            .getName()
                                                                            .length()));
    }

}
