package com.jstarcraft.recommendation.evaluator.rank;

import com.jstarcraft.ai.math.structure.matrix.SparseMatrix;
import com.jstarcraft.recommendation.evaluator.AbstractRankingEvaluatorTestCase;
import com.jstarcraft.recommendation.evaluator.Evaluator;
import com.jstarcraft.recommendation.evaluator.ranking.MAPEvaluator;

public class MAPEvaluatorTestCase extends AbstractRankingEvaluatorTestCase {

	@Override
	protected Evaluator<?> getEvaluator(SparseMatrix featureMatrix) {
		return new MAPEvaluator(10);
	}

	@Override
	protected float getMeasure() {
		return 0.3753629F;
	}

}