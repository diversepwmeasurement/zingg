package zingg.spark;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.spark.sql.Column;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.RelationalGroupedDataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.functions;
import org.apache.spark.sql.catalyst.encoders.RowEncoder;
import org.apache.spark.sql.expressions.Window;
import org.apache.spark.sql.expressions.WindowSpec;
import org.apache.spark.sql.types.DataType;

import scala.collection.JavaConverters;
import zingg.FindAndLabeller;
import zingg.TrainingDataFinder;
import zingg.block.Block;
import zingg.block.Canopy;
import zingg.block.Tree;
import zingg.model.Model;
import zingg.spark.model.SparkModel;
import zingg.client.SparkFrame;
import zingg.client.ZFrame;
import zingg.client.ZinggClientException;
import zingg.client.ZinggOptions;
import zingg.client.util.ColName;
import zingg.client.util.ColValues;
import zingg.client.util.Util;
import zingg.util.DSUtil;
import zingg.util.GraphUtil;
import zingg.util.ModelUtil;
import zingg.util.PipeUtilBase;


public class SparkFindAndLabeller extends FindAndLabeller<SparkSession, Dataset<Row>, Row, Column,DataType,DataType> {

	public static String name = "zingg.SparkFindAndLabeller";
	public static final Log LOG = LogFactory.getLog(SparkFindAndLabeller.class);

	private SparkSession sparkSession;
	@Override
	public void setSpark(SparkSession session) {
		this.sparkSession = session;
		
	}

	public SparkFindAndLabeller() {
		setZinggOptions(ZinggOptions.FIND_AND_LABEL);
	}

	
	@Override
	public void cleanup() throws ZinggClientException {
		// TODO Auto-generated method stub
		
	}
	
}
