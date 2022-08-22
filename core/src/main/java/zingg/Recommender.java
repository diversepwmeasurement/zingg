package zingg;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import zingg.client.ZinggClientException;
import zingg.client.ZinggOptions;
import zingg.recommender.StopWordsRecommender;

public class Recommender<S,D,R,C, T,T1> extends ZinggBase<S,D,R,C,T,T1> {

	protected static String name = "zingg.Recommender";
	public static final Log LOG = LogFactory.getLog(Recommender.class);

	public Recommender() {
		setZinggOptions(ZinggOptions.RECOMMEND);
 	}

	public void execute() throws ZinggClientException {
		try {
			LOG.info("Recommender starts");

			//Recommendations out of data
			//StopWordsRecommender stopWordsRecommender = new StopWordsRecommender(args);
			//stopWordsRecommender.process();

			LOG.info("Recommender finishes");
		} catch (Exception e) {
			e.printStackTrace();
			throw new ZinggClientException(e.getMessage());
		}
	}
}