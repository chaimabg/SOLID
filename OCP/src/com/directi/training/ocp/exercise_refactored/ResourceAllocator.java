package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator
{
    public int allocate(IResource resource)
    {
        int resourceId = resource.findFree();
        resource.markBusy(resourceId);
        return resourceId;
    }

    public void free(IResource resource, int resourceId)
    {
        resource.markFree(resourceId);
    }
}
