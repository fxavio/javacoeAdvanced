Java NIO (Non-Blocking I/O)

// how can we document this functionality on the Readme?
### API Key Authentication

The API Key Authentication is a security mechanism that allows the server to authenticate the client using an API Key. The API Key is a unique identifier that is passed in the header of the HTTP request. The server validates the API Key and allows the client to access the resources if the API Key is valid.

To use the API Key Authentication, you can set the `X-Api-Key` header in the request. Currently The header value should be the API Key that Amaliai Team have generated.
```java
X-Api-Key: <YOUR_API_KEY>
```

If the API Key is not provided, the server will respond with an error message.

```json
{
  "success": false,
  "status": 401,
  "error": "X-Api-Key header is missing"
}
```

If the API Key format is invalid, the server will respond with an error message.

```json
{
  "success": false,
  "status": 401,
  "error": "Invalid X-Api-Key format"
}
```

If the API Key is invalid, the server will respond with an error message.

    ```json
    {
    "success": false,
    "status": 401,
    "error": "Invalid X-Api-Key"
    }
    ```

[//]: # (prompt must be provided)

[//]: # (REQUEST BODY:)

[//]: # ({)

[//]: # ("prompt": "")

[//]: # (})

[//]: # (error response)

[//]: # ({)

[//]: # ("success": false,)

[//]: # ("error": "Prompt cannot be empty",)

[//]: # ("status": "BAD_REQUEST")

[//]: # (})

#### if stream is available
Accept header should be set to 'text/event-stream', Accept: text/event-stream for Server-Sent Events (SSE) requests.
#### if stream is not available
Accept header should be set to '*/*', Accept: */*" for JSON requests




if the prompt is empty, the server will respond with an error message.

```json
{
  "success": false,
  "status": 400,
  "error": "Prompt cannot be empty"
}
```

[//]: # (RESPONSE BODY:)

[//]: # ({)

[//]: # ("success": true,)

[//]: # ("data": "")

[//]: # (})

[//]: # (success response)

[//]: # ({)

[//]: # ("success": true,)

[//]: # ("data": "Hello, World!")

[//]: # (})

if the prompt is not empty, the server will respond with a success message.

```json
{
  "success": true,
  "data": "Hello, World!"
}
```

[//]: # (REQUEST BODY:)

[//]: # ({)

[//]: # ("prompt": "Hello, World!")

[//]: # (})

[//]: # (error response)

[//]: # ({)

[//]: # ("success": false,)

[//]: # ("error": "Prompt cannot be empty",)

[//]: # ("status": "BAD_REQUEST")

[//]: # (})

[//]: # (Accept header should be set to 'text/event-stream' for Server-Sent Events &#40;SSE&#41; requests.)
