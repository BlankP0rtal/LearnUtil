package com.gdghkfst;

public class LabelAnnotation
{
    @JsonProperty("mid")
    public String getMid() { 
         return this.mid 
    }
    public String setMid(String mid) { 
         this.mid = mid 
    }
    String mid;

    @JsonProperty("description")
    public String getDescription() { 
         return this.description 
    }
    public String setDescription(String description) { 
         this.description = description 
    }
    String description;

    @JsonProperty("score")
    public double getScore() { 
         return this.score 
    }
    public double setScore(double score) { 
         this.score = score 
    }
    double score;

    @JsonProperty("topicality")
    public double getTopicality() { 
         return this.topicality 
    }
    public double setTopicality(double topicality) { 
         this.topicality = topicality 
    }
    double topicality;

}

public class SafeSearchAnnotation
{
    @JsonProperty("adult")
    public String getAdult() { 
         return this.adult 
    }
    public String setAdult(String adult) { 
         this.adult = adult 
    }
    String adult;

    @JsonProperty("spoof")
    public String getSpoof() { 
         return this.spoof 
    }
    public String setSpoof(String spoof) { 
         this.spoof = spoof 
    }
    String spoof;

    @JsonProperty("medical")
    public String getMedical() { 
         return this.medical 
    }
    public String setMedical(String medical) { 
         this.medical = medical 
    }
    String medical;

    @JsonProperty("violence")
    public String getViolence() { 
         return this.violence 
    }
    public String setViolence(String violence) { 
         this.violence = violence 
    }
    String violence;

    @JsonProperty("racy")
    public String getRacy() { 
         return this.racy 
    }
    public String setRacy(String racy) { 
         this.racy = racy 
    }
    String racy;

}

public class Color
{
    @JsonProperty("red")
    public int getRed() { 
         return this.red 
    }
    public int setRed(int red) { 
         this.red = red 
    }
    int red;

    @JsonProperty("green")
    public int getGreen() { 
         return this.green 
    }
    public int setGreen(int green) { 
         this.green = green 
    }
    int green;

    @JsonProperty("blue")
    public int getBlue() { 
         return this.blue 
    }
    public int setBlue(int blue) { 
         this.blue = blue 
    }
    int blue;

}

public class Color
{
    @JsonProperty("color")
    public Color getColor() { 
         return this.color 
    }
    public Color setColor(Color color) { 
         this.color = color 
    }
    Color color;

    @JsonProperty("score")
    public double getScore() { 
         return this.score 
    }
    public double setScore(double score) { 
         this.score = score 
    }
    double score;

    @JsonProperty("pixelFraction")
    public double getPixelFraction() { 
         return this.pixelFraction 
    }
    public double setPixelFraction(double pixelFraction) { 
         this.pixelFraction = pixelFraction 
    }
    double pixelFraction;

}

public class DominantColors
{
    @JsonProperty("colors")
    public List<Color> getColors() { 
         return this.colors 
    }
    public List<Color> setColors(List<Color> colors) { 
         this.colors = colors 
    }
    List<Color> colors;

}

public class ImagePropertiesAnnotation
{
    @JsonProperty("dominantColors")
    public DominantColors getDominantColors() { 
         return this.dominantColors 
    }
    public DominantColors setDominantColors(DominantColors dominantColors) { 
         this.dominantColors = dominantColors 
    }
    DominantColors dominantColors;

}

public class Vertex
{
    @JsonProperty("x")
    public int getX() { 
         return this.x 
    }
    public int setX(int x) { 
         this.x = x 
    }
    int x;

    @JsonProperty("y")
    public int? getY() { 
         return this.y 
    }
    public int? setY(int? y) { 
         this.y = y 
    }
    int? y;

}

public class BoundingPoly
{
    @JsonProperty("vertices")
    public List<Vertex> getVertices() { 
         return this.vertices 
    }
    public List<Vertex> setVertices(List<Vertex> vertices) { 
         this.vertices = vertices 
    }
    List<Vertex> vertices;

}

public class CropHint
{
    @JsonProperty("boundingPoly")
    public BoundingPoly getBoundingPoly() { 
         return this.boundingPoly 
    }
    public BoundingPoly setBoundingPoly(BoundingPoly boundingPoly) { 
         this.boundingPoly = boundingPoly 
    }
    BoundingPoly boundingPoly;

    @JsonProperty("confidence")
    public double getConfidence() { 
         return this.confidence 
    }
    public double setConfidence(double confidence) { 
         this.confidence = confidence 
    }
    double confidence;

    @JsonProperty("importanceFraction")
    public double getImportanceFraction() { 
         return this.importanceFraction 
    }
    public double setImportanceFraction(double importanceFraction) { 
         this.importanceFraction = importanceFraction 
    }
    double importanceFraction;

}

public class CropHintsAnnotation
{
    @JsonProperty("cropHints")
    public List<CropHint> getCropHints() { 
         return this.cropHints 
    }
    public List<CropHint> setCropHints(List<CropHint> cropHints) { 
         this.cropHints = cropHints 
    }
    List<CropHint> cropHints;

}

public class WebEntity
{
    @JsonProperty("entityId")
    public String getEntityId() { 
         return this.entityId 
    }
    public String setEntityId(String entityId) { 
         this.entityId = entityId 
    }
    String entityId;

    @JsonProperty("score")
    public double getScore() { 
         return this.score 
    }
    public double setScore(double score) { 
         this.score = score 
    }
    double score;

    @JsonProperty("description")
    public String getDescription() { 
         return this.description 
    }
    public String setDescription(String description) { 
         this.description = description 
    }
    String description;

}

public class FullMatchingImage
{
    @JsonProperty("url")
    public String getUrl() { 
         return this.url 
    }
    public String setUrl(String url) { 
         this.url = url 
    }
    String url;

}

public class PartialMatchingImage
{
    @JsonProperty("url")
    public String getUrl() { 
         return this.url 
    }
    public String setUrl(String url) { 
         this.url = url 
    }
    String url;

}

public class FullMatchingImage
{
    @JsonProperty("url")
    public String getUrl() { 
         return this.url 
    }
    public String setUrl(String url) { 
         this.url = url 
    }
    String url;

}

public class PartialMatchingImage
{
    @JsonProperty("url")
    public String getUrl() { 
         return this.url 
    }
    public String setUrl(String url) { 
         this.url = url 
    }
    String url;

}

public class PagesWithMatchingImage
{
    @JsonProperty("url")
    public String getUrl() { 
         return this.url 
    }
    public String setUrl(String url) { 
         this.url = url 
    }
    String url;

    @JsonProperty("pageTitle")
    public String getPageTitle() { 
         return this.pageTitle 
    }
    public String setPageTitle(String pageTitle) { 
         this.pageTitle = pageTitle 
    }
    String pageTitle;

    @JsonProperty("fullMatchingImages")
    public List<FullMatchingImage> getFullMatchingImages() { 
         return this.fullMatchingImages 
    }
    public List<FullMatchingImage> setFullMatchingImages(List<FullMatchingImage> fullMatchingImages) { 
         this.fullMatchingImages = fullMatchingImages 
    }
    List<FullMatchingImage> fullMatchingImages;

    @JsonProperty("partialMatchingImages")
    public List<PartialMatchingImage> getPartialMatchingImages() { 
         return this.partialMatchingImages 
    }
    public List<PartialMatchingImage> setPartialMatchingImages(List<PartialMatchingImage> partialMatchingImages) { 
         this.partialMatchingImages = partialMatchingImages 
    }
    List<PartialMatchingImage> partialMatchingImages;

}

public class VisuallySimilarImage
{
    @JsonProperty("url")
    public String getUrl() { 
         return this.url 
    }
    public String setUrl(String url) { 
         this.url = url 
    }
    String url;

}

public class BestGuessLabel
{
    @JsonProperty("label")
    public String getLabel() { 
         return this.label 
    }
    public String setLabel(String label) { 
         this.label = label 
    }
    String label;

    @JsonProperty("languageCode")
    public String getLanguageCode() { 
         return this.languageCode 
    }
    public String setLanguageCode(String languageCode) { 
         this.languageCode = languageCode 
    }
    String languageCode;

}

public class WebDetection
{
    @JsonProperty("webEntities")
    public List<WebEntity> getWebEntities() { 
         return this.webEntities 
    }
    public List<WebEntity> setWebEntities(List<WebEntity> webEntities) { 
         this.webEntities = webEntities 
    }
    List<WebEntity> webEntities;

    @JsonProperty("fullMatchingImages")
    public List<FullMatchingImage> getFullMatchingImages() { 
         return this.fullMatchingImages 
    }
    public List<FullMatchingImage> setFullMatchingImages(List<FullMatchingImage> fullMatchingImages) { 
         this.fullMatchingImages = fullMatchingImages 
    }
    List<FullMatchingImage> fullMatchingImages;

    @JsonProperty("partialMatchingImages")
    public List<PartialMatchingImage> getPartialMatchingImages() { 
         return this.partialMatchingImages 
    }
    public List<PartialMatchingImage> setPartialMatchingImages(List<PartialMatchingImage> partialMatchingImages) { 
         this.partialMatchingImages = partialMatchingImages 
    }
    List<PartialMatchingImage> partialMatchingImages;

    @JsonProperty("pagesWithMatchingImages")
    public List<PagesWithMatchingImage> getPagesWithMatchingImages() { 
         return this.pagesWithMatchingImages 
    }
    public List<PagesWithMatchingImage> setPagesWithMatchingImages(List<PagesWithMatchingImage> pagesWithMatchingImages) { 
         this.pagesWithMatchingImages = pagesWithMatchingImages 
    }
    List<PagesWithMatchingImage> pagesWithMatchingImages;

    @JsonProperty("visuallySimilarImages")
    public List<VisuallySimilarImage> getVisuallySimilarImages() { 
         return this.visuallySimilarImages 
    }
    public List<VisuallySimilarImage> setVisuallySimilarImages(List<VisuallySimilarImage> visuallySimilarImages) { 
         this.visuallySimilarImages = visuallySimilarImages 
    }
    List<VisuallySimilarImage> visuallySimilarImages;

    @JsonProperty("bestGuessLabels")
    public List<BestGuessLabel> getBestGuessLabels() { 
         return this.bestGuessLabels 
    }
    public List<BestGuessLabel> setBestGuessLabels(List<BestGuessLabel> bestGuessLabels) { 
         this.bestGuessLabels = bestGuessLabels 
    }
    List<BestGuessLabel> bestGuessLabels;

}

public class Vision
{
    @JsonProperty("labelAnnotations")
    public List<LabelAnnotation> getLabelAnnotations() { 
         return this.labelAnnotations 
    }
    public List<LabelAnnotation> setLabelAnnotations(List<LabelAnnotation> labelAnnotations) { 
         this.labelAnnotations = labelAnnotations 
    }
    List<LabelAnnotation> labelAnnotations;

    @JsonProperty("safeSearchAnnotation")
    public SafeSearchAnnotation getSafeSearchAnnotation() { 
         return this.safeSearchAnnotation 
    }
    public SafeSearchAnnotation setSafeSearchAnnotation(SafeSearchAnnotation safeSearchAnnotation) { 
         this.safeSearchAnnotation = safeSearchAnnotation 
    }
    SafeSearchAnnotation safeSearchAnnotation;

    @JsonProperty("imagePropertiesAnnotation")
    public ImagePropertiesAnnotation getImagePropertiesAnnotation() { 
         return this.imagePropertiesAnnotation 
    }
    public ImagePropertiesAnnotation setImagePropertiesAnnotation(ImagePropertiesAnnotation imagePropertiesAnnotation) { 
         this.imagePropertiesAnnotation = imagePropertiesAnnotation 
    }
    ImagePropertiesAnnotation imagePropertiesAnnotation;

    @JsonProperty("cropHintsAnnotation")
    public CropHintsAnnotation getCropHintsAnnotation() { 
         return this.cropHintsAnnotation 
    }
    public CropHintsAnnotation setCropHintsAnnotation(CropHintsAnnotation cropHintsAnnotation) { 
         this.cropHintsAnnotation = cropHintsAnnotation 
    }
    CropHintsAnnotation cropHintsAnnotation;

    @JsonProperty("webDetection")
    public WebDetection getWebDetection() { 
         return this.webDetection 
    }
    public WebDetection setWebDetection(WebDetection webDetection) { 
         this.webDetection = webDetection 
    }
    WebDetection webDetection;

}

