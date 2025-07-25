# This program lists some popular APIs available for building GenAI (Generative AI) applications.
# The list includes API names, providers, and a brief description.

def list_genai_apis():
    apis = [
        {
            "name": "OpenAI GPT (ChatGPT, GPT-4, DALL·E, Whisper)",
            "provider": "OpenAI",
            "description": "Text, image, and speech generation and understanding. Powerful for chatbots, summarization, code, and more.",
            "url": "https://platform.openai.com/docs/api-reference"
        },
        {
            "name": "Google Gemini (PaLM, Imagen, Codey, etc.)",
            "provider": "Google Cloud",
            "description": "Text, code, and image generation models. Useful for chat, summarization, and creative tasks.",
            "url": "https://cloud.google.com/vertex-ai/docs/generative-ai/learn/overview"
        },
        {
            "name": "Anthropic Claude",
            "provider": "Anthropic",
            "description": "Large language model API for safe and helpful conversational AI.",
            "url": "https://docs.anthropic.com/claude/reference/getting-started"
        },
        {
            "name": "Cohere Generate",
            "provider": "Cohere",
            "description": "Text generation, classification, and embedding APIs.",
            "url": "https://docs.cohere.com/"
        },
        {
            "name": "Hugging Face Inference API",
            "provider": "Hugging Face",
            "description": "Access thousands of open-source models for text, image, audio, and more.",
            "url": "https://huggingface.co/inference-api"
        },
        {
            "name": "Stability AI (Stable Diffusion)",
            "provider": "Stability AI",
            "description": "Image generation API for creating images from text prompts.",
            "url": "https://platform.stability.ai/docs/api-reference"
        },
        {
            "name": "Aleph Alpha Luminous",
            "provider": "Aleph Alpha",
            "description": "Multilingual large language models for text generation and understanding.",
            "url": "https://docs.aleph-alpha.com/api/"
        }
    ]

    print("Popular APIs for Building GenAI Applications:\n")
    for api in apis:
        print(f"Name: {api['name']}")
        print(f"Provider: {api['provider']}")
        print(f"Description: {api['description']}")
        print(f"Docs: {api['url']}\n")
 
    if __name__ == "__main__":
