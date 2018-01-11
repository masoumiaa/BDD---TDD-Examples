Feature: Getting Sepro website version

  Scenario: Get Sepro website version
	When I request Sepro website version"
	Then I should get a valid response
	And the response should be:
	"""
	{
	"app":"1.2.0"
	}
	"""