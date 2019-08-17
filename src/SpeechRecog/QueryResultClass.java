package SpeechRecog;

public class QueryResultClass {

	/*public static QueryResult detectIntentAudio(
		    String projectId,
		    String audioFilePath,
		    String sessionId,
		    String languageCode)
		    throws Exception {
		  // Instantiates a client
		  try (SessionsClient sessionsClient = SessionsClient.create()) {
		    // Set the session name using the sessionId (UUID) and projectID (my-project-id)
		    SessionName session = SessionName.of(projectId, sessionId);
		    System.out.println("Session Path: " + session.toString());

		    // Note: hard coding audioEncoding and sampleRateHertz for simplicity.
		    // Audio encoding of the audio content sent in the query request.
		    AudioEncoding audioEncoding = AudioEncoding.AUDIO_ENCODING_LINEAR_16;
		    int sampleRateHertz = 16000;

		    // Instructs the speech recognizer how to process the audio content.
		    InputAudioConfig inputAudioConfig = InputAudioConfig.newBuilder()
		        .setAudioEncoding(audioEncoding) // audioEncoding = AudioEncoding.AUDIO_ENCODING_LINEAR_16
		        .setLanguageCode(languageCode) // languageCode = "en-US"
		        .setSampleRateHertz(sampleRateHertz) // sampleRateHertz = 16000
		        .build();

		    // Build the query with the InputAudioConfig
		    QueryInput queryInput = QueryInput.newBuilder().setAudioConfig(inputAudioConfig).build();

		    // Read the bytes from the audio file
		    byte[] inputAudio = Files.readAllBytes(Paths.get(audioFilePath));

		    // Build the DetectIntentRequest
		    DetectIntentRequest request = DetectIntentRequest.newBuilder()
		        .setSession(session.toString())
		        .setQueryInput(queryInput)
		        .setInputAudio(ByteString.copyFrom(inputAudio))
		        .build();

		    // Performs the detect intent request
		    DetectIntentResponse response = sessionsClient.detectIntent(request);

		    // Display the query result
		    QueryResultClass queryResult = response.getQueryResult();
		    System.out.println("====================");
		    System.out.format("Query Text: '%s'\n", queryResult.getQueryText());
		    System.out.format("Detected Intent: %s (confidence: %f)\n",
		        queryResult.getIntent().getDisplayName(), queryResult.getIntentDetectionConfidence());
		    System.out.format("Fulfillment Text: '%s'\n", queryResult.getFulfillmentText());

		    return queryResult;
		  }
		}*/
}
