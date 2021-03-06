/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import java.io.File;
import org.openapitools.client.model.ModelApiResponse;
import org.openapitools.client.model.Pet;
import java.util.Set;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PetApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;

  public PetApi() {
    this(new ApiClient());
  }

  public PetApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
  }

  /**
   * Add a new pet to the store
   * 
   * @param body Pet object that needs to be added to the store (required)
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Void> addPet (Pet body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'body' when calling addPet"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "addPet call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {

              return CompletableFuture.completedFuture(null);
          }
      });
    } catch (IOException e) {
      return CompletableFuture.failedFuture(new ApiException(e));
    }
  }
  /**
   * Deletes a pet
   * 
   * @param petId Pet id to delete (required)
   * @param apiKey  (optional)
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Void> deletePet (Long petId, String apiKey) throws ApiException {
    // verify the required parameter 'petId' is set
    if (petId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'petId' when calling deletePet"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet/{petId}"
        .replace("{petId}", ApiClient.urlEncode(petId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (apiKey != null) {
      localVarRequestBuilder.header("api_key", apiKey.toString());
    }
    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "deletePet call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {

              return CompletableFuture.completedFuture(null);
          }
      });
  }
  /**
   * Finds Pets by status
   * Multiple status values can be provided with comma separated strings
   * @param status Status values that need to be considered for filter (required)
   * @return List&lt;Pet&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<List<Pet>> findPetsByStatus (List<String> status) throws ApiException {
    // verify the required parameter 'status' is set
    if (status == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'status' when calling findPetsByStatus"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet/findByStatus";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "status", status));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "findPetsByStatus call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
              try {
                  return CompletableFuture.completedFuture(
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<Pet>>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
                        }
      });
  }
  /**
   * Finds Pets by tags
   * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
   * @param tags Tags to filter by (required)
   * @return Set&lt;Pet&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Set<Pet>> findPetsByTags (Set<String> tags) throws ApiException {
    // verify the required parameter 'tags' is set
    if (tags == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'tags' when calling findPetsByTags"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet/findByTags";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "tags", tags));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "findPetsByTags call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
              try {
                  return CompletableFuture.completedFuture(
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Set<Pet>>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
                        }
      });
  }
  /**
   * Find pet by ID
   * Returns a single pet
   * @param petId ID of pet to return (required)
   * @return Pet
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Pet> getPetById (Long petId) throws ApiException {
    // verify the required parameter 'petId' is set
    if (petId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'petId' when calling getPetById"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet/{petId}"
        .replace("{petId}", ApiClient.urlEncode(petId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "getPetById call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
              try {
                  return CompletableFuture.completedFuture(
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Pet>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
                        }
      });
  }
  /**
   * Update an existing pet
   * 
   * @param body Pet object that needs to be added to the store (required)
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Void> updatePet (Pet body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'body' when calling updatePet"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "updatePet call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {

              return CompletableFuture.completedFuture(null);
          }
      });
    } catch (IOException e) {
      return CompletableFuture.failedFuture(new ApiException(e));
    }
  }
  /**
   * Updates a pet in the store with form data
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @param name Updated name of the pet (optional)
   * @param status Updated status of the pet (optional)
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Void> updatePetWithForm (Long petId, String name, String status) throws ApiException {
    // verify the required parameter 'petId' is set
    if (petId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'petId' when calling updatePetWithForm"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet/{petId}"
        .replace("{petId}", ApiClient.urlEncode(petId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "updatePetWithForm call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {

              return CompletableFuture.completedFuture(null);
          }
      });
  }
  /**
   * uploads an image
   * 
   * @param petId ID of pet to update (required)
   * @param additionalMetadata Additional data to pass to server (optional)
   * @param file file to upload (optional)
   * @return ModelApiResponse
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ModelApiResponse> uploadFile (Long petId, String additionalMetadata, File file) throws ApiException {
    // verify the required parameter 'petId' is set
    if (petId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'petId' when calling uploadFile"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/pet/{petId}/uploadImage"
        .replace("{petId}", ApiClient.urlEncode(petId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "uploadFile call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
              try {
                  return CompletableFuture.completedFuture(
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ModelApiResponse>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
                        }
      });
  }
  /**
   * uploads an image (required)
   * 
   * @param petId ID of pet to update (required)
   * @param requiredFile file to upload (required)
   * @param additionalMetadata Additional data to pass to server (optional)
   * @return ModelApiResponse
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ModelApiResponse> uploadFileWithRequiredFile (Long petId, File requiredFile, String additionalMetadata) throws ApiException {
    // verify the required parameter 'petId' is set
    if (petId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'petId' when calling uploadFileWithRequiredFile"));
    }
    // verify the required parameter 'requiredFile' is set
    if (requiredFile == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'requiredFile' when calling uploadFileWithRequiredFile"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fake/{petId}/uploadImageWithRequiredFile"
        .replace("{petId}", ApiClient.urlEncode(petId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "uploadFileWithRequiredFile call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
              try {
                  return CompletableFuture.completedFuture(
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ModelApiResponse>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
                        }
      });
  }
}
