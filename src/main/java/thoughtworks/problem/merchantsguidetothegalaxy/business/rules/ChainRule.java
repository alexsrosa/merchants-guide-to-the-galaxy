package thoughtworks.problem.merchantsguidetothegalaxy.business.rules;

import thoughtworks.problem.merchantsguidetothegalaxy.model.RomanModel;

public interface ChainRule {

    void setNext(ChainRule rule);

    void executeChain(RomanModel romanModel);

    void invoke(RomanModel romanModel);
}
